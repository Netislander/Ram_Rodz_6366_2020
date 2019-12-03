/**
 * Test_Code
 */
public class Test_Code {
    public static void main(String[]args) {
        System.out.println("initiative");

        double fb = 1;
        double lr = 0;
        double turn = 0;

        System.out.println(omniMatch (fb, lr, turn)[0]);
        System.out.println(omniMatch (fb, lr, turn)[1]);
        System.out.println(omniMatch (fb, lr, turn)[2]);
        System.out.println(omniMatch (fb, lr, turn)[3]);
        System.out.println(omniMatch (fb, lr, turn)[4]);
        System.out.println(omniMatch (fb, lr, turn)[5]);
        
    }

    public static Double[] omniMatch(double fb, double lr, double turn) {
        
        double Wheel1 = fb * -1;
        double Wheel2 = fb * -1;
        double Wheel3 = fb;
        double Wheel4 = fb;
        double Wheel5 = lr * -1;
        double Wheel6 = lr;

        if (fb == 0) {
            Wheel1 = turn * -1;
            Wheel2 = turn * -1;
            Wheel3 = turn * -1;
            Wheel4 = turn * -1;
        }
        if (fb > 0){
            if (lr > 0) {
                Wheel3 -= turn;
                Wheel4 -= turn;
            } else {
                Wheel1 += turn;
                Wheel2 += turn;
            }
        }
        if (fb < 0) {
            if (lr > 0) {
                Wheel3 += turn;
                Wheel4 += turn;
            }else {
                Wheel1 -= turn;
                Wheel2 -= turn;
            }
        }
        Double[] motorOutput = {Wheel1, Wheel2, Wheel3, Wheel4, Wheel5, Wheel6};
        
        return motorOutput;

    }    
}