package comp.comp152;

import java.util.Random;

public class GovernmentProgram {
    private String programType;

    public GovernmentProgram() {
        String[] types = {"Medicare", "Medicaid", "VA", "Obamacare", "CongessCare"};
        var numberPicker = new Random();
        var pick = numberPicker.nextInt(5);
        programType = types[pick];
    }

  public void payBill(double bill){
        if (programType.equals("CongessCare"))
            System.out.println(programType + "just paid a bill of"+ bill*3);
        else
            System.out.println(programType+" just paid a bill of "+ bill);
    }
}
