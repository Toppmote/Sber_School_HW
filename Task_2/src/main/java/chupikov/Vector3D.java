package chupikov;

/**
 * Класс вектора в трёхмерном пространстве
 */
public final class Vector3D {

    /**
     * Координаты вектора
     */
    private final double x, y, z;

    /**
     * Получение значения координаты z
     * @return Значение координаты z
     */
    public double getX() {
        return x;
    }

    /**
     * Получение значения координаты z
     * @return Значение координаты z
     */
    public double getY() {
        return y;
    }

    /**
     * Получение значения координаты z
     * @return Значение координаты z
     */
    public double getZ() {
        return z;
    }

    /**
     * Конструктор класса
     * @param x - координата х
     * @param y - координата y
     * @param z - координата z
     */
    Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }



    /**
     * Метод, вычисляющий длину вектора
     * @return Длина вектора
     */
    public double vectorLength(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     * Метод, вычисляющий скалярное произведение двух векторов
     * @param anotherVector - другой вектор
     * @return Скалярное произведение
     */
    public double scalarProduct(Vector3D anotherVector){
        return this.x * anotherVector.x + this.y * anotherVector.y + this.z * anotherVector.z;
    }

    /**
     * Метод, вычисляющий векторное произведение двух векторов
     * @param anotherVector - другой вектор
     * @return Векторное произведение
     */
    public Vector3D vectorsProduct(Vector3D anotherVector){
        return new Vector3D(this.y * anotherVector.z + this.z * anotherVector.y,
                            this.z * anotherVector.x + this.x * anotherVector.z,
                            this.x * anotherVector.y + this.y * anotherVector.x);
    }

    /**
     * Метод, вычисляющий косинус угла между векторами
     * @param anotherVector - другой вектор
     * @return Косинус угла между векторами
     */
    public double angleBetweenVectors(Vector3D anotherVector){
        return this.scalarProduct(anotherVector) / this.vectorLength() * anotherVector.vectorLength();
    }

    /**
     * Метод, вычисляющий сумму двух векторов
     * @param anotherVector - другой вектор
     * @return Сумма двух векторов
     */
    public Vector3D vectorsSum(Vector3D anotherVector){
        return new Vector3D(this.x + anotherVector.x, this.y + anotherVector.y, this.z + anotherVector.z);
    }

    /**
     * Метод, вычисляющий разность двух векторов
     * @param anotherVector - другой вектор
     * @return Разность двух векторов
     */
    public Vector3D vectorsSub(Vector3D anotherVector){
        return new Vector3D(this.x - anotherVector.x, this.y - anotherVector.y, this.z - anotherVector.z);
    }

    /**
     * Метод генерации n случайных векторов
     * @param n - количество векторов, которые необходимо вернуть
     * @return Массив случайных векторов
     */
    public static Vector3D[] generateRandomVectors(int n){
        Vector3D[] vectors = new Vector3D[n];
        for(int i = 0; i < n; i++)
            vectors[i] = new Vector3D(Math.random(), Math.random(), Math.random());
        return vectors;
    }

}
