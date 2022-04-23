// class Rectangle{
//     /*Private anahtar kelimesi ile data hiding işlemini 
//     gerçekleştirdik
//     */
//     private double length;//Data hiding process(işlemi)
//     private double breadth;//Data hiding process(işlemi)

//     public double getLength(){
//         return length;
//     }

//     public void setLength(double l){
//         if(l >0)
//             length = l;
//         else
//             length = 0;
//     }

//     public double getBreadth(){
//         return breadth;
//     }

//     public void setBreadth(double b){
//         if(b > 0)
//             breadth = b;
//         else
//             breadth = 0;
//     }

//     public double area()
//     {
//         return length * breadth;
//     }

//     public double perimeter()
//     {
//         return 2*(length+breadth);
//     }
//     public boolean isSquare()
//     {
//         return (length == breadth);
//     }
// }

// public class DataHiding {
//     public static void main(String[] args) {
//         Rectangle rec = new Rectangle();

//         rec.setLength(-12.2);
//         rec.setBreadth(13.5);

//         System.out.printf("Length of the rectangle : %.2f ", rec.getLength());
//         System.out.printf("Breadth of the rectangle : %.2f ", rec.getBreadth());
//     }
// }
