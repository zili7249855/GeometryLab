public class GeometryLabTest {
    
    public static void main (String[] args) {
        GeometryLab topkek = new GeometryLab();
        System.out.println(topkek .f(2, 3));
        System.out.println(topkek .f(4, 8));
        System.out.println(topkek .g(3, 5));
        System.out.println(topkek .g(5, 3));
        System.out.println(topkek .h(2, 9));
        System.out.println(topkek .h(3, 10));
        System.out.println(topkek .j(5, 10));
        System.out.println(topkek .j(10, 5));
        System.out.println(topkek .k(9, 7));
        System.out.println(topkek .k(7, 9));
        System.out.println(topkek .m(3, 4, 5));
        System.out.println(topkek .m(4, 6, 3));
        System.out.println(topkek .f(topkek .g(3, 5),topkek .k(7, 9)));
        System.out.println(topkek .f(topkek .j(10, 5),topkek .h(4, 10)));
        System.out.println(topkek .g(topkek .m(3, 4, 5), topkek .h(4, 10)));
        System.out.println(topkek .g(topkek .j(5, 10), topkek .f(2, 3)));
        System.out.println(topkek .h(topkek .m(4, 6, 3),topkek .f(4, 8)));
        System.out.println(topkek .h(topkek .k(9, 7),topkek .g(5, 3)));
        System.out.println(topkek .j(topkek .k(7, 9),topkek .g(3, 5)));
        System.out.println(topkek .j(topkek .h(2, 9),topkek .m(4, 6, 3)));
        System.out.println(topkek .k(topkek .m(3, 4, 5),topkek .j(10, 5)));
        System.out.println(topkek .k(topkek .k(9, 7),topkek .f(4, 8)));
        System.out.println(topkek .m(topkek .h(4, 10),topkek .f(2, 3),topkek .g(5, 3)));	
        System.out.println(topkek .m(topkek .k(7, 9),topkek .j(5, 10),topkek .h(4, 10))); 
        System.out.println(topkek .triArea(2, 3));
        System.out.println(topkek .triArea(4, 8));
        System.out.println(topkek .trapArea(3, 4, 5));
        System.out.println(topkek .trapArea(4, 6, 3));
        System.out.println(topkek .rectArea(3, 5));
        System.out.println(topkek .rectArea(5, 3));
        System.out.println(topkek .circArea(7));
        System.out.println(topkek .circArea(9));
        System.out.println(topkek .paralArea(2, 9));
        System.out.println(topkek .paralArea(4, 10));
        System.out.println(topkek .pythHypotenuse(5, 10));
        System.out.println(topkek .pythHypotenuse(9, 7));
        System.out.println(topkek .triPrismVol(10, 5, 4));
        System.out.println(topkek .triPrismVol(7, 9, 3));
        System.out.println(topkek .rectPrismVol(2, 3, 4));
        System.out.println(topkek .rectPrismVol(8, 3, 6));
        System.out.println(topkek .rectPyramidVol(5, 7, 9));
        System.out.println(topkek .rectPyramidVol(4, 6, 8));
        System.out.println(topkek .rectPyramidVol(4, 6, 8));
        System.out.println(topkek .rectPyramidVol(4, 6, 8));
        System.out.println(topkek .sphereVol(6));
        System.out.println(topkek .sphereVol(8));
        System.out.println(topkek .coneVol(6, 5));
        System.out.println(topkek .coneVol(8, 7));
        System.out.println(topkek .sphereSurfArea(4));
        System.out.println(topkek .sphereSurfArea(7));
        System.out.println(topkek .cylSurfArea(4, 7));
        System.out.println(topkek .cylSurfArea(5, 3));
        System.out.println(topkek .rectPrismSurfArea(2, 3, 4));
        System.out.println(topkek .rectPrismSurfArea(8, 3, 6));
        System.out.println(topkek .triArea(topkek .f(2, 3),topkek .h(4, 8)));
        System.out.println(topkek .rectArea(topkek .g(7, 5), topkek .j(5, 3)));
        System.out.println(topkek .trapArea(topkek .m(3, 4, 5), topkek .m(4, 6, 3), topkek .m(8, 3, 6)));
        System.out.println(topkek .circArea(topkek .k(8, 5)));
        System.out.println(topkek .paralArea(topkek .j(9, 2),topkek .f(4, 10)));
        System.out.println(topkek .pythHypotenuse(topkek .f(5, 10),topkek .g(9, 7)));
        System.out.println(topkek .triPrismVol(topkek .m(10, 5, 4),topkek .m(7, 9, 3),topkek .m(5, 7, 3)));
        System.out.println(topkek .rectPrismVol(topkek .h(2, 4),topkek .m(8, 3, 6),topkek .h(3, 6)));
        System.out.println(topkek .rectPyramidVol(topkek .m(5, 7, 9),topkek .m(4, 6, 8),topkek .k(20, 7)));
        System.out.println(topkek .cylVol(topkek .h(9, 2),topkek .k(10, 3)));
        System.out.println(topkek .sphereVol(topkek .g(9, 6)));
        System.out.println(topkek .coneVol(topkek .j(6, 5),topkek .j(8, 7)));
        System.out.println(topkek .sphereSurfArea(topkek .m(4, 3, 1)));
        System.out.println(topkek .cylSurfArea(4,topkek .f(5, 3)));
        System.out.println(topkek .rectPrismSurfArea(topkek .pythHypotenuse(3, 4), 3,topkek .k(13, 5)));
        
        
        
    }
    
}