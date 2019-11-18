public class Main {

    public static void main(String[] args) {
        System.out.println("Черепашки мутанты ниндзя");
        System.out.println("________________________");

        createObject("Леонардо").print();
        System.out.println("________________________");
        createObject("Донателло").print();
        System.out.println("________________________");
        createObject("Микеланджело").print();
    }

    public static Printable createObject(String ninjaTurtle){
        Printable printable = null;
        switch (ninjaTurtle){
            case "Леонардо":
                printable = new Leonardo("Леонардо", 25, "Катаны", "Лидер");
                break;
            case "Донателло":
                printable = new Donatello("Донателло", 25, "Палка", "Умный");
                break;
            case "Микеланджело":
                printable = new Michelangelo("Микеланджело", 25, "Нунчаки", "Веселый");
                break;
        }
        return printable;
    }
}
