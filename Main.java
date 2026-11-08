
void main() {
    IO.println("Привет Java!");
    IO.println("Калькулятор площади прямоугольника.");
    Scanner scanner = new Scanner(System.in);
    IO.println("Введите высоту прямоугольника:");
    int length = scanner.nextInt();
    IO.println("Введите ширину прямоугольника:");
    int width = scanner.nextInt();
    if (length>=0 && width >=0) {
        int rectangleArea = length * width;
        IO.println("Площадь = "+ rectangleArea);
    }
    else
        IO.println("отрицательные значения длин сторон недопустимы");
    }
