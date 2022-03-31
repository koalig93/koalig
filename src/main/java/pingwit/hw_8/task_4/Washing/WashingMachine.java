package pingwit.hw_8.task_4.Washing;

public class WashingMachine {
    boolean power = false;
    boolean running = false;

    WashingMachine() { // я думаю этот конструктор можно убрать
    }

    public void turnOnThePower() {
        power = true;
        System.out.println("The power is on");
    }

    public void turnOffThePower() throws PowerOffException {
        power = false;
        if (running) {
            running = false;
            throw new PowerOffException();
        }
        System.out.println("The power is off");

    }

    public void start() {
        if (power) {
            running = true;
            System.out.println("Started washing");
        } else {
            System.out.println("Cannot start washing without power");
        }
    }

    public void stop() {
        running = false;
        if (power) {
            System.out.println("Stopped washing");
        }
    }

    /* я не увидел где вызывает метож drainWater.
     Думаю его стоит сделать приватный и вызывать в блоке try-finally во время работы машинки. А т.к. свет пропадает внезапно, то понадобиться что-то вроде
     Random random = new Random();
     random.nextBoolean();
        
     таким образом получится автономная программа со случайным выключением света. Можно конечно добавить метод выключение эл-ва и в многопоточке его вызвать, но мы до этого еще не дошли
   */
    
    public void drainWater() {
        System.out.println("Water is drained");
    }
}
