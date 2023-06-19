package JavaQuete6;

public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname,boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }
    //getters
    public String getFirstname() {
        return this.firstname;
    }
    public Boolean getaware() {
        return this.aware;
    }
    //setters
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setAware(Boolean aware){
        this.aware = aware;
    }
    
    public String whoAmI() {
        if(this.getaware()==true){
            return "Je m'appelle "+ this.getFirstname() +" et je suis aware";
        }else{
            return "Je m'appelle "+ this.getFirstname() +" et je ne suis pas aware";
        }
    }
}
