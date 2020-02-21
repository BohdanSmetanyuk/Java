package product.object;

public class Product {
    public String name;
    public String oldPrice;
    public String newPrice;

    public Product(String name, String oldPrice, String newPrice)
    {
        this.name = name;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public String getName() {
        return name;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        if(!this.name.equals(((Product)obj).name)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        String hashString = name + oldPrice + newPrice;
        int hash = 0;
        for(int i=0; i<hashString.length(); i++) {
            hash += (int)hashString.charAt(i) * i;
        }
        return hash;
    }


    @Override
    public String toString() {
        return name + ", old: " + oldPrice + ", new: " + newPrice;
    }

}
