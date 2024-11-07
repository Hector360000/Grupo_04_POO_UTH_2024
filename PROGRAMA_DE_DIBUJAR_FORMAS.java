package com.mycompany.programa_de_dibujar_formas;

//segundo cambio

import java.util.Scanner;

abstract class Forma {
protected String color;

public Forma(String color) {
this.color = color;
}

public void establecercolor(String color) {
this.color = color;
}

public abstract String dibujar();
}

class Circulo extends Forma {
private double radio;

public Circulo(String color, double radio) {
super(color);
this.radio = radio;
}

public double getradio() {
return radio;
}

@Override
public String dibujar() {
return "Circulo \nColor: " + color;
}

public double calculararea() {
return Math.round(Math.PI * Math.pow(radio, 2));
}
}

class Linea extends Forma {
private double largo;

public Linea(String color, double largo) {
super(color);
this.largo = largo;
}

public double getlargo() {
return largo;
}

@Override
public String dibujar() {
return "Linea \nColor: " + color;
}
}

class Triangulo extends Forma {
private double base;
private double altura;

public Triangulo(String color, double base, double altura) {
super(color);
this.base = base;
this.altura = altura;
}

public double getbase() {
return base;
}

public double getaltura() {
return altura;
}

@Override
public String dibujar() {
return "Triangulo  \nColor: " + color;
}

public double calculararea() {
return Math.round((base * altura) / 2);
}
}

class Cuadrado extends Forma {
private double largo;

public Cuadrado(String color, double largo) {
super(color);
this.largo = largo;
}

public double getlargo() {
return largo;
}

@Override
public String dibujar() {
return "Cuadrado \nColor: " + color;
}

public double calculararea() {
return Math.round(Math.pow(largo, 2));
}
}

public class PROGRAMA_DE_DIBUJAR_FORMAS {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
char opcion = 'a';
String color = "gris";

while(opcion != 'e'){

System.out.println("\n-------------------------------------");
System.out.println("\nSeleccione una forma:");
System.out.println("a. Dibujar un circulo");
System.out.println("b. Dibujar una linea");
System.out.println("c. Dibujar un triangulo");
System.out.println("d. Dibujar un cuadrado");
System.out.println("e. Salir del programa");
opcion = scanner.next().charAt(0);
scanner.nextLine(); 

switch (opcion) {
case 'a':
System.out.print("\nIngrese el color del circulo: ");
color = scanner.nextLine();
System.out.print("\nIngrese el radio del circulo: ");
double radio = scanner.nextDouble();
Circulo circulo = new Circulo(color, radio);
System.out.println("\nForma: " + circulo.dibujar());
System.out.println("Area: " + circulo.calculararea());
break;

case 'b':
System.out.print("\nIngrese el color de la linea: ");
color = scanner.nextLine();
System.out.print("\nIngrese el largo de la linea: ");
double largoLinea = scanner.nextDouble();
Linea linea = new Linea(color, largoLinea);
System.out.println("\nForma: " + linea.dibujar());
System.out.println("Largo: " + linea.getlargo());
break;

case 'c':
System.out.print("\nIngrese el color del triangulo: ");
color = scanner.nextLine();
System.out.print("\nIngrese la base del triangulo: ");
double base = scanner.nextDouble();
System.out.print("\nIngrese la altura del triangulo: ");
double altura = scanner.nextDouble();
Triangulo triangulo = new Triangulo(color, base, altura);
System.out.println("\nForma: " + triangulo.dibujar());
System.out.println("Area: " + triangulo.calculararea());
break;

case 'd':
System.out.print("\nIngrese el color del cuadrado: ");
color = scanner.nextLine();
System.out.print("\nIngrese el largo del cuadrado: ");
double largoCuadrado = scanner.nextDouble();
Cuadrado cuadrado = new Cuadrado(color, largoCuadrado);
System.out.println("\nForma: " + cuadrado.dibujar());
System.out.println("Area: " + cuadrado.calculararea());
break;

case 'e':
scanner.close();
System.out.println("\nHa salido del porgrama");
break;

default:
System.out.println("\nOperacion no permitida");
break;
}
}
}
}
