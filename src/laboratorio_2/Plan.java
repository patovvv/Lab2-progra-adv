package laboratorio_2;
//cm=costo minutos
//cM=costo mantencion
public class Plan {    
    private String Tipo;
    private int cm;
    private int cM;
    private int total_C;

    public Plan(String Tipo, int cm, int cM) {
        this.Tipo = Tipo;
        this.cm = cm;
        this.cM = cM;
    }

    public String getTipo() {
        return Tipo;}
    
    public int getCm() {
        return cm;}
    
    public int getcM() {
        return cM;}
    
    public int getTotal_C() {
        return total_C;}
    
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;}
    
    public void setCm(int cm) {
        this.cm = cm;}
    
    public void setcM(int cM) {
        this.cM = cM;}
    
    public void setTotal_C(int total_C) {
        this.total_C = total_C;}
    
    
    
    
    
    
    
}
