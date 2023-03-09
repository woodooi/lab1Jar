package ua.lviv.iot.algo.part1.lab1;
import lombok.*;


@Getter
@ToString
@Setter
@AllArgsConstructor

public class SchoolPen {
    private String id;
    private String brand;
    private String color;
    private String material;
    private double size;
    private int numPencils;
    private int numPens;
    private int numErasers;
    public void addPencil(){
        numPencils++;
    }
    public void addPen(){
        numPens++;
    }
    public void removePencil(){
        numPencils--;
    }
    public void removePen(){
        numPens--;
    }
    public static SchoolPen instance = new SchoolPen();

    static SchoolPen getInstance(){
        return instance;
    }

    public SchoolPen(){
        this.id="isn-101";
    }
    public static void main(String[] args) {
        SchoolPen backpack[] = new SchoolPen[3];
        backpack[0] = new SchoolPen();
        backpack[1] = new SchoolPen("239832-234234", "Toyota"
                , "red", "leather", 23.1, 2, 3, 28);
        backpack[2].getInstance();
        for(int i=0; i<3; i++)
        {
            System.out.println(backpack[i]);
        }
    }
}