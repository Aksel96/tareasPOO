package ico.fes;

public class Cafetera {
    private short agua;
    private short cafe;
    private short crema;
    private short vasos;

    public Cafetera() {
    }

    public Cafetera(short agua, short cafe, short crema, short vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public short getAgua() {
        return agua;
    }

    public void setAgua(short agua) {
        if (agua >= 0 && agua <= 5000){
            this.agua = agua;
        }
    }

    public short getCafe() {
        return cafe;
    }

    public void setCafe(short cafe) {
        if (cafe >= 0 && cafe <= 1000){
            this.cafe = cafe;
        }
    }

    public short getCrema() {
        return crema;
    }

    public void setCrema(short crema) {
        if (crema >= 0 && crema <= 1500){
            this.crema = crema;
        }
    }

    public short getVasos() {
        return vasos;
    }

    public void setVasos(short vasos) {
        if (vasos >= 0 && vasos <= 50){
            this.vasos = vasos;
        }

    }

    @Override
    public String toString() {
        return "Estado de la cafetera: " +
                "{ " +
                "agua: " + agua +
                " ml"+
                ", cafe: " + cafe +
                " g "+
                ", crema: " + crema +
                " ml "+
                ", vasos:  "+ vasos +
                '}';
    }
    public void americano(){
        if (getAgua() >= 180 && getCafe() >= 15 && getVasos() >= 1) {
            System.out.println("Aqui tiene su cafe americano!!");
            agua -= 180;
            cafe -= 15;
            vasos -= 1;
        }else {
            System.out.println("Los ingredientes no alcanzan para un cafe americano, Pide otro...");
        }
    }
    public void expreso(){
        if (getAgua() >= 120 && getCafe() >= 20 && getVasos() >= 1) {
            System.out.println("Aqui tiene su cafe expreso!!");
            agua -= 120;
            cafe -= 20;
            vasos -= 1;
        }else {
            System.out.println("Los ingredientes no alcanzan para un cafe expreso, Pide otro...");
        }
    }
    public void capuchino() {
        if (getAgua() >= 100 && getCafe() >= 14 && getVasos() >= 1 && getCrema() >= 70) {
            System.out.println("Aqui tiene su cafe capuchino!!");
            agua -= 100;
            cafe -= 14;
            vasos -= 1;
            crema -= 70;

        }else {
            System.out.println("Los ingredientes no alcanzan para un cafe capuchino, Pide otro...");
        }
    }

    //Metodo para verificar si hay ingredientes suficientes para un cafe cualquiera
    public boolean verifIngredientes(){
        return getAgua() >= 100 && getCafe() >= 14 && getVasos() >= 1 && getCrema() >= 70;
    }

    //Metodo para verificar si puedes hacer el siguiente cafe del tipo que se pidio
    public boolean verifNextCafe(String tipoCafe){
        switch (tipoCafe){
            case "americano" -> {
                return getAgua() < 180 || getCafe() < 15 || getVasos() < 1;
            }
            case "expreso" -> {
                return getAgua() < 120 || getCafe() < 20 || getVasos() < 1;
            }
            case "capuchino" -> {
                return getAgua() < 100 || getCafe() < 14 || getVasos() < 1 || getCrema() < 70;
            }
        }
        return false;
    }

    //Metodo que te dice si cuentas con el minimo de materiales para un cafe
    public boolean suficientesIngredientes(){
        return getAgua() < 100 || getCafe() < 14 || getVasos() < 1 || getCrema() < 70;
    }
}
