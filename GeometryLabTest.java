public class GeometryLabTest {
    
    public static void main(String[] args) {
        GeometryLab topKek = new GeometryLab();
        System.out.println(topKek .f(2, 3));
        System.out.println(topKek .f(4, 8));
        System.out.println(topKek .g(3, 5));
        System.out.println(topKek .g(5, 3));
        System.out.println(topKek .h(2, 9));
        System.out.println(topKek .h(3, 10));
        System.out.println(topKek .j(5, 10));
        System.out.println(topKek .j(10, 5));
        System.out.println(topKek .k(9, 7));
        System.out.println(topKek .k(7, 9));
        System.out.println(topKek .m(3, 4, 5));
        System.out.println(topKek .m(4, 6, 3));
        System.out.println(topKek .f(topKek .g(3, 5),topKek .k(7, 9)));
        System.out.println(topKek .f(topKek .j(10, 5),topKek .h(4, 10)));
        System.out.println(topKek .g(topKek .m(3, 4, 5), topKek .h(4, 10)));
        System.out.println(topKek .g(topKek .j(5, 10), topKek .f(2, 3)));
        System.out.println(topKek .h(topKek .m(4, 6, 3),topKek .f(4, 8)));
        System.out.println(topKek .h(topKek .k(9, 7),topKek .g(5, 3)));
        System.out.println(topKek .j(topKek .k(7, 9),topKek .g(3, 5)));
        System.out.println(topKek .j(topKek .h(2, 9),topKek .m(4, 6, 3)));
        System.out.println(topKek .k(topKek .m(3, 4, 5),topKek .j(10, 5)));
        System.out.println(topKek .k(topKek .k(9, 7),topKek .f(4, 8)));
        System.out.println(topKek .m(topKek .h(4, 10),topKek .f(2, 3),topKek .g(5, 3)));	
        System.out.println(topKek .m(topKek .k(7, 9),topKek .j(5, 10),topKek .h(4, 10))); 
        System.out.println(topKek .triArea(2, 3));
        System.out.println(topKek .triArea(4, 8));
        System.out.println(topKek .trapArea(3, 4, 5));
        System.out.println(topKek .trapArea(4, 6, 3));
        System.out.println(topKek .rectArea(3, 5));
        System.out.println(topKek .rectArea(5, 3));
        System.out.println(topKek .circArea(7));
        System.out.println(topKek .circArea(9));
        System.out.println(topKek .paralArea(2, 9));
        System.out.println(topKek .paralArea(4, 10));
        System.out.println(topKek .pythHypotenuse(5, 10));
        System.out.println(topKek .pythHypotenuse(9, 7));
        System.out.println(topKek .triPrismVol(10, 5, 4));
        System.out.println(topKek .triPrismVol(7, 9, 3));
        System.out.println(topKek .rectPrismVol(2, 3, 4));
        System.out.println(topKek .rectPrismVol(8, 3, 6));
        System.out.println(topKek .rectPyramidVol(5, 7, 9));
        System.out.println(topKek .rectPyramidVol(4, 6, 8));
        System.out.println(topKek .rectPyramidVol(4, 6, 8));
        System.out.println(topKek .rectPyramidVol(4, 6, 8));
        System.out.println(topKek .sphereVol(6));
        System.out.println(topKek .sphereVol(8));
        System.out.println(topKek .coneVol(6, 5));
        System.out.println(topKek .coneVol(8, 7));
        System.out.println(topKek .sphereSurfArea(4));
        System.out.println(topKek .sphereSurfArea(7));
        System.out.println(topKek .cylSurfArea(4, 7));
        System.out.println(topKek .cylSurfArea(5, 3));
        System.out.println(topKek .rectPrismSurfArea(2, 3, 4));
        System.out.println(topKek .rectPrismSurfArea(8, 3, 6));
        System.out.println(topKek .triArea(topKek .f(2, 3),topKek .h(4, 8)));
        System.out.println(topKek .rectArea(topKek .g(7, 5), topKek .j(5, 3)));
        System.out.println(topKek .trapArea(topKek .m(3, 4, 5), topKek .m(4, 6, 3), topKek .m(8, 3, 6)));
        System.out.println(topKek .circArea(topKek .k(8, 5)));
        System.out.println(topKek .paralArea(topKek .j(9, 2),topKek .f(4, 10)));
        System.out.println(topKek .pythHypotenuse(topKek .f(5, 10),topKek .g(9, 7)));
        System.out.println(topKek .triPrismVol(topKek .m(10, 5, 4),topKek .m(7, 9, 3),topKek .m(5, 7, 3)));
        System.out.println(topKek .rectPrismVol(topKek .h(2, 4),topKek .m(8, 3, 6),topKek .h(3, 6)));
        System.out.println(topKek .rectPyramidVol(topKek .m(5, 7, 9),topKek .m(4, 6, 8),topKek .k(20, 7)));
        System.out.println(topKek .cylVol(topKek .h(9, 2),topKek .k(10, 3)));
        System.out.println(topKek .sphereVol(topKek .g(9, 6)));
        System.out.println(topKek .coneVol(topKek .j(6, 5),topKek .j(8, 7)));
        System.out.println(topKek .sphereSurfArea(topKek .m(4, 3, 1)));
        System.out.println(topKek .cylSurfArea(4,topKek .f(5, 3)));
        System.out.println(topKek .rectPrismSurfArea(topKek .pythHypotenuse(3, 4), 3,topKek .k(13, 5)));
        
        
        
    }
    
}