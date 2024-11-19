package TiendaInformatica;

public class TiendaInformatica {
    public static void main(String[] args) {
		
        Producto p1 = new Impresora(12000, "EPSON", 150, 10, false);
        Producto p2 = new Impresora(11000, "HP", 200, 8, true);
        Producto p3 = new Computadora(470000, "ASUS ROG", 50, "ESCRITORIO", 16, 512, false);
        Producto p4 = new Computadora(850000, "LENOVO IDEALPAD", 50, "ESCRITORIO", 16, 512, true);
        
        Cajero c1 = new Cajero("Jose", p1, 8);
        Cajero c2 = new Cajero("Hernan", p2, 6);
        Cajero c3 = new Cajero("Beltran", p3, 4);
        Cajero c4 = new Cajero("Luciano", p4, 2);
        
        System.out.println("El precio de la venta es: " + c1.calcularPrecioFinal());
        System.out.println("El precio de la venta es: " + c2.calcularPrecioFinal());
        System.out.println("El precio de la venta es: " + c3.calcularPrecioFinal());
        System.out.println("El precio de la venta es: " + c4.calcularPrecioFinal());

   }
}
