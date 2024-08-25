public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("Primitivos.main()" + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor minimo " + Byte.MIN_VALUE);
        System.out.println("valor maximo " + Byte.MAX_VALUE);

        short numeroShot = 32767;
        System.out.println("Primitivos.main()" + numeroShot);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor minimo " + Short.MIN_VALUE);
        System.out.println("valor maximo " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("Primitivos.main()" + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor minimo " + Integer.MIN_VALUE);
        System.out.println("valor maximo " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("Primitivos.main()" + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor minimo " + Long.MIN_VALUE);
        System.out.println("valor maximo " + Long.MAX_VALUE);
    }
}
