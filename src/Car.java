public class Car {
    String name;
    float mpg,disp,drat,wt,qsec;
    int cyl,hp,vs,am,gear,carb;

    public Car(String rowStr){
//        car	mpg	cyl	disp	hp	drat	wt	qsec	vs	am	gear	carb
        String data[] = rowStr.split(",");
        this.name = data[0];
        this.mpg = Float.parseFloat(data[1]);
        this.cyl = Integer.parseInt(data[2]);
        this.disp = Float.parseFloat(data[3]);
        this.hp = Integer.parseInt(data[4]);
        this.drat = Float.parseFloat(data[5]);
        this.wt = Float.parseFloat(data[6]);
        this.qsec = Float.parseFloat(data[7]);
        this.vs = Integer.parseInt(data[8]);
        this.am = Integer.parseInt(data[9]);
        this.gear = Integer.parseInt(data[10]);
        this.carb = Integer.parseInt(data[11]);
    }

    public Car(String name, float mpg,int cyl, float disp, int hp,float drat, float wt, float qsec,   int vs, int am, int gear, int carb) {
        this.name = name;
        this.mpg = mpg;
        this.disp = disp;
        this.drat = drat;
        this.wt = wt;
        this.qsec = qsec;
        this.cyl = cyl;
        this.hp = hp;
        this.vs = vs;
        this.am = am;
        this.gear = gear;
        this.carb = carb;
    }

    public float getGPMW(){
        return (mpg/wt);
    }

    @Override
    public String toString() {
        return name+"{" +
                "mpg=" + mpg +
                ", disp=" + disp +
                ", drat=" + drat +
                ", wt=" + wt +
                ", qsec=" + qsec +
                ", cyl=" + cyl +
                ", hp=" + hp +
                ", vs=" + vs +
                ", am=" + am +
                ", gear=" + gear +
                ", carb=" + carb +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMpg() {
        return mpg;
    }

    public void setMpg(float mpg) {
        this.mpg = mpg;
    }

    public float getDisp() {
        return disp;
    }

    public void setDisp(float disp) {
        this.disp = disp;
    }

    public float getDrat() {
        return drat;
    }

    public void setDrat(float drat) {
        this.drat = drat;
    }

    public float getWt() {
        return wt;
    }

    public void setWt(float wt) {
        this.wt = wt;
    }

    public float getQsec() {
        return qsec;
    }

    public void setQsec(float qsec) {
        this.qsec = qsec;
    }

    public int getCyl() {
        return cyl;
    }

    public void setCyl(int cyl) {
        this.cyl = cyl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getVs() {
        return vs;
    }

    public void setVs(int vs) {
        this.vs = vs;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }
}
