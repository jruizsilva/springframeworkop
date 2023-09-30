package springframeworkop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        System.out.println(calculadora.holaMundo());

        GestorFacturas gestorFacturas = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestorFacturas.calculadora.holaMundo());
        System.out.println(gestorFacturas.nombre);
    }
}