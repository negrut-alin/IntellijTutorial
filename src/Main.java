
    // Design Pattern (Factory Method)

    enum LOGISTICSEnum{
        ROAD,
        SEA
    }

    interface Logistics{
        void transport();
    }

    class Road implements Logistics{

        @Override
        public void transport() {
            System.out.println("Transport by Truck !");
        }
    }

    class Sea implements  Logistics{

        @Override
        public void transport() {
            System.out.println("Transport by Boat !");
        }
    }


    class LogisticsFactory{
        Logistics getLogistics(LOGISTICSEnum VAR){
              if(VAR == LOGISTICSEnum.ROAD) {
                  return new Road();
              }

             else{
              return new Sea();
             }
        }
    }

public class Main{
    public static void main(String[] Args){
        System.out.println("Hello World !");
        Logistics Var;
        LogisticsFactory logisticsFactory = new LogisticsFactory();
           Var =  logisticsFactory.getLogistics(LOGISTICSEnum.SEA);
            Var.transport();
    }
}
