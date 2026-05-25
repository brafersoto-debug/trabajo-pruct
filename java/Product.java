class  Product {
private String id;
private  double  price;
private String name;
private int stock;
private boolean disponible;


public Product(){
this.id = "0";
this.price = 1200;
this.name = "papas";
this.stock = 20;
this.disponible = true;

}

public Product(String id,double price,String name,int stock,boolean disponible){
this.id = id;
this.price = price;
this.name = name;
this.stock = stock;
this.disponible = disponible;

}

public String getId(){
    return id;
}

public double getPrice(){
    return price;
}
public String getName(){
    return name;
}

public int grtStock(){
    return stock;
}

public boolean getDisponible(){
   return  disponible;
}

public void setId(String id){
    this.id= id;
}
public void setPrice(double  price){
    this.price = price;
}

public void setName(String name){
    this.name = name;
}

public void setStock(int stock){
    this.stock=stock;
}

public void  setDisponible(boolean disponible){
   this. disponible= disponible;
}

public String toString(){
return "producto [ID: " + this.id + "\n" +
       "nombre: " + this.name + "\n" +
       "precio: " + this.price + "\n" +
       "stock: " + this.stock + "\n" +
       "disponible: " + this.disponible + "]";
}}