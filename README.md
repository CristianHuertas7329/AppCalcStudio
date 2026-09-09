<html><body>
<!--StartFragment--><html><head></head><body><h1>GeoCalc Studio (AppCalcStudio)</h1>
<p>Aplicación de escritorio en <strong>Java Swing</strong> para calcular el <strong>área y el perímetro</strong> de figuras geométricas, desarrollada como proyecto del curso Programación II (Universidad Mariano Gálvez de Guatemala). Simula una herramienta interna para un despacho de arquitectura.</p>
<h2>Funcionamiento general</h2>
<ol>
<li>Al ejecutar <code>AppCalcStudio.java</code> (clase con el <code>main</code>), se abre la ventana principal <code>frmPantallaInicial</code>.</li>
<li>Esa ventana reproduce música de fondo en loop (<code>intro.ogg</code>) usando las librerías Vorbis/Jorbis y muestra un menú lateral con 4 botones: <strong>Rectángulo, Cuadrado, Triángulo y Trapecio</strong>.</li>
<li>Al hacer clic en un botón, la ventana:
<ul>
<li>Vacía el panel central (<code>pnlSubmenus</code>).</li>
<li>Inserta el panel correspondiente a esa figura (<code>pnlRectangulo</code>, <code>pnlCuadrado</code>, <code>pnlTriangulo</code> o <code>pnlTrapecio</code>).</li>
<li>Redibuja la interfaz (<code>revalidate()</code> + <code>repaint()</code>).</li>
</ul>
</li>
<li>Cada panel de figura tiene campos de texto para los datos requeridos y un botón <strong>CALCULAR</strong>. Al presionarlo:
<ul>
<li>Se leen y convierten los valores de los campos de texto a <code>double</code>.</li>
<li>Se crea una instancia del modelo correspondiente (ej. <code>new Modelo.Rectangulo(base, altura, 4)</code>).</li>
<li>Se invocan sus métodos <code>area()</code> y <code>perimetro()</code>.</li>
<li>El resultado se muestra en etiquetas dentro del mismo panel.</li>
<li>Si el usuario ingresa un valor no numérico, se captura la excepción y se muestra un <code>JOptionPane</code> de aviso.</li>
</ul>
</li>
</ol>
<h2>Estructura del proyecto</h2>
<pre><code>src/main/java/
├── app/principal/
│   └── AppCalcStudio.java        # Punto de entrada (main)
├── Modelo/                       # Lógica de cálculo (POO)
│   ├── Poligono.java             # Clase abstracta base
│   ├── Rectangulo.java
│   ├── Cuadrado.java
│   ├── Triangulo.java
│   └── Trapecio.java
└── UI/                           # Interfaz gráfica (Swing)
    ├── frmPantallaInicial.java   # Ventana principal / menú
    ├── pnlRectangulo.java
    ├── pnlCuadrado.java
    ├── pnlTriangulo.java
    ├── pnlTrapecio.java
    ├── PanelBackground.java      # JPanel con imagen de fondo personalizada
    └── BotonBackground.java      # JButton con imagen de fondo personalizada

src/main/resources/archive/       # Imágenes de fondo y música (.ogg)
</code></pre>
<h2>Modelo de datos (paquete <code>Modelo</code>)</h2>
<p>Aplica herencia y abstracción: todas las figuras extienden la clase abstracta <code>Poligono</code>, que define el contrato <code>area()</code> / <code>perimetro()</code> y guarda el número de lados.</p>

Clase | Datos que recibe | Fórmula de área | Fórmula de perímetro
-- | -- | -- | --
Rectangulo | lado1, lado2 | lado1 * lado2 | 2 * (lado1 + lado2)
Cuadrado | lado | lado² | 4 * lado
Triangulo | lado1, lado2, lado3 | Fórmula de Herón | lado1 + lado2 + lado3
Trapecio | baseMenor, baseMayor, altura, lado1, lado2 | (baseMayor + baseMenor) / 2 * altura | baseMayor + baseMenor + lado1 + lado2


<h2>Interfaz (paquete <code>UI</code>)</h2>
<ul>
<li><strong><code>frmPantallaInicial</code></strong>: ventana principal, controla el menú y el cambio dinámico de panel central.</li>
<li><strong><code>pnlRectangulo</code> / <code>pnlCuadrado</code> / <code>pnlTriangulo</code> / <code>pnlTrapecio</code></strong>: un panel por figura, cada uno con sus propios campos de entrada, botón de cálculo y etiquetas de resultado.</li>
<li><strong><code>PanelBackground</code></strong> y <strong><code>BotonBackground</code></strong>: componentes Swing personalizados (extienden <code>JPanel</code>/<code>JButton</code>) que sobreescriben <code>paintComponent</code> para dibujar una imagen como fondo, usados en toda la interfaz oscura/temática de la app.</li>
</ul>
<h2>Requisitos y ejecución</h2>
<ul>
<li>Java (JDK) y Maven.</li>
<li>Dependencias (definidas en <code>pom.xml</code>): <code>AbsoluteLayout</code> (NetBeans), <code>vorbisspi</code>, <code>jorbis</code>, <code>tritonus-share</code> (soporte de audio <code>.ogg</code>).</li>
</ul>
<pre><code class="language-bash">mvn clean package
java -jar target/AppCalcStudio-1.0-SNAPSHOT.jar
</code></pre>
<p>El <code>pom.xml</code> usa <code>maven-shade-plugin</code> para generar un JAR ejecutable con todas las dependencias incluidas, apuntando a <code>app.principal.AppCalcStudio</code> como clase principal.</p>
<h2>Repositorio</h2>
<ul>
<li>GitHub: <code>CristianHuertas7329/AppCalcStudio</code></li>
<li>Rama de trabajo: <code>desarrollo</code></li>
</ul></body></html><!--EndFragment-->
</body>
</html>
