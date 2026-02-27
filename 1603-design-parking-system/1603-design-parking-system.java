class ParkingSystem {
    int b=0,m=0,s=0;
    public ParkingSystem(int big, int medium, int small) {
        b=big;
        m=medium;
        s=small;
    }
    
    public boolean addCar(int cartype) {
        if((cartype==1&&b==0)||(cartype==2&&m==0)||(cartype==3&&s==0)){ 
            return false;
    }
    if(cartype==1){
        b-=1;
    }
    else if(cartype==2){
        m-=1;
    }else{
        s-=1;
    }
    return true;
}
}
