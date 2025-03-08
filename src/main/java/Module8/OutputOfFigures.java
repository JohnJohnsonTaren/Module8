package Module8;

public class OutputOfFigures {
    public void printShapeName(Shape shape) {
        System.out.println(shape.getFigure());
    }
    public static void main(String[] args) {
        OutputOfFigures printer = new OutputOfFigures();

        Circle circle = new Circle();
        printer.printShapeName(circle); // Выведет: Circle (Круг)

        Line line = new Line();
        printer.printShapeName(line); // Выведет: Line (Линия)

        Triangle triangle = new Triangle();
        printer.printShapeName(triangle); // Выведет: Triangle (Треугольник)

        Quad quad = new Quad();
        printer.printShapeName(quad); // Выведет: Quad (Квадрат (четырехугольник))

        Pentagon pentagon = new Pentagon();
        printer.printShapeName(pentagon); // Выведет: Pentagon (Пятиугольник)

        Polyhedron polyhedron = new Polyhedron();
        printer.printShapeName(polyhedron); // Выведет: Polyhedron (Многогранник)
    }
}
