public class App {
    public static void main(String[] args) throws Exception {
        // Ninja jiraya = new Ninja("Jiraya", "Familia", new String[]{"Corte Vertical", "Corte Horizontal"});
        // System.out.println("Treinamento:"+jiraya.train());
        // System.out.println(jiraya);
        // AcademicStudent naruto = new AcademicStudent("Naruto", "Uzumaki", new String[]{"Jutsu dos clones da sombra", "Rasengan", "Chamar Kurama"});
        // System.out.println(naruto.train());
        // System.out.println(naruto.play());
        Genin nija = new Genin("noma", "ponorra", new String[] {"jjjuj","juujjj"}, "bosta");
        System.out.println(nija.goToMission());
        System.out.println(nija.train());
    }
}