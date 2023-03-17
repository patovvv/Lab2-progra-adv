package laboratorio_2;
public class Cliente {
    
    private String Nombre;
    private Plan Plan;
    private int min_c;
    private int total;
    //total pagar=total
    //min_c= minutos consumidos
    
    public Cliente(String Nombre, Plan Plan, int min_c) {
        this.Nombre = Nombre;
        this.Plan = Plan;
        this.min_c = min_c;    
    }

    public String getNombre() {
        return Nombre;}
    public Plan getPlan() {
        return Plan;}
    public int getMin_c() {
        return min_c;}
    public int getTotal() {
        return total;}
 
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;}
    public void setPlan(Plan Plan) {
        this.Plan = Plan;}
    public void setMin_c(int min_c) {
        this.min_c = min_c;}
    public void setTotal(int total) {
        this.total = total;} 
    
}
