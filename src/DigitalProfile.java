public class DigitalProfile {
    public static void main(String[] args) throws Exception {
        String name = "Federico";
        String lastName = "Garcia";
        String city = "Montevideo";
        int age = 29;
        double heigth = 1.75;
        String[] hobbies = new String[3];
        hobbies[0] = "Leer";
        hobbies[1] = "Escuchar musica";
        hobbies[2] = "Amigos";
        int number = (int)(Math.random() * 100);
        String nameCharacters = name + " " + lastName;
        
        
        System.out.println("PERFIL DIGITAL DE:" + name.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("Ciudad: " + city.substring(0, 3));
        System.out.println("Edad: " + age + " años (aprox. " + age * 52 + " semanas)");
        System.out.println("Altura: " + heigth + " " + "m");
        System.out.println("Tus intereses: " + hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
        System.out.println("Tu numero de la suerte es: " + number);
        System.out.println("Tu nombre tiene " + nameCharacters.length() + " caractes");
     }
  }

