package Abstract;

public class Duck {
        /* two subclasses cityduck and wildduck use same method. instead of repeating code, we are going to implement the code i.e
        use composition then, the super class can implement/use the abstract or interface class
        *
        *
        * */
        private int age;
        private int legs;


        private IQuackBehaviour iQuackBehaviour;
        private IFlyBehaviour iFlyBehaviour;

        public Duck(int age, int legs) {
                this.age = age;
                 this.legs = legs;
        }
        public void setIQuackBehaviour(IQuackBehaviour iQuackBehaviour){
                this.iQuackBehaviour = iQuackBehaviour;
        }

        public IQuackBehaviour getiQuackBehaviour() {
                return iQuackBehaviour;
        }
        public void setIFlyBehaviour(IFlyBehaviour iFlyBehaviour){
                this.iFlyBehaviour = iFlyBehaviour;
        }
        public void quack(){
                this.iQuackBehaviour.quack();
        }
        public void fly(){
                this.iFlyBehaviour.fly();
        }
}
