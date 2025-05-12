class ParkingSystem {
    private int bigslots;
    private int mediumslots;
    private int smallslots;

    public ParkingSystem(int big, int medium, int small) {
        this.bigslots = big;
        this.mediumslots = medium;
        this.smallslots=small; 
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(bigslots>0){
                bigslots--;
                return true;
            }
        }else if(carType==2){
            if(mediumslots>0){
                mediumslots--;
                return true;
            }
        }else if(carType==3){
            if(smallslots>0){
                smallslots--;
                return true;
            }
        }
        return false;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */