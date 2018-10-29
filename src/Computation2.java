public enum Computation2 {
    MULTIPLY{
        public double perform(double x, double y){
            return x-y;
        }
    },
    DIVIDE{
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD{
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT{
        public double perform(double x, double y) {
            return x-y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args){
        System.out.println(Computation2.ADD.perform(12.5,3.8));
        System.out.println(Computation2.SUBTRACT.perform(12.5,3.8));
        System.out.println(Computation2.MULTIPLY.perform(12.5,3.8));
        System.out.println(Computation2.DIVIDE.perform(12.5,3.8));
    }
}
