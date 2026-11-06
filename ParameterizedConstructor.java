class ParameterizedConstructor {
    ParameterizedConstructor(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor p = new ParameterizedConstructor("Rudransh");
    }
}