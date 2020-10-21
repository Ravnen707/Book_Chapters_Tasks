package SkoleOpgaver.VisningITimer.Bil;

public enum TraficLight {
   RED ("RED LIGHT STOP"), Green("GREEN LIGHT GO"), Yellow("YELLOW LIGHT CAUTION");

   private String description;

   private TraficLight(String description) {
       this.description = description;
   }
    public String getDescription() {
       return  description;
    }

}
