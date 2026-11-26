package agh.po.symulator;

public class Engine extends Component{
    private Integer revolutions;
    private Integer revolutionsStep;
    private Integer revolutionsMax;

    public void revolutionsStepUp(){
        if (revolutions>=1000 && revolutions<revolutionsMax-revolutionsStep){
            revolutions+=revolutionsStep;
            if (revolutions>revolutionsMax-revolutionsStep) {
                revolutions = revolutionsMax;
            }
        }
        else {
            return;
        }
    }

    public void engineOn() {
        revolutions = 1000;
    }

    public void engineOff(){
        revolutions = 0;
    }
}
