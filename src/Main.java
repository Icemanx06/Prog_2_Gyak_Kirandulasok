import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class nevek implements Comparable<nevek>{

    String nev;
    LinkedList<tura> turak = new LinkedList<>();
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final nevek other = (nevek) obj;

        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.turak, other.turak)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(nev);

        return sb.toString();
    }

    @Override
    public int compareTo(nevek o) {
        return this.nev.compareTo(o.nev);
    }

  
    
}
class tura{
    String nev;

    public tura(String nev) {
        this.nev = nev;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final tura other = (tura) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        int db = 0;
        LinkedList<nevek> list = new LinkedList<>();
        LinkedList<nevek> mindegyik = new LinkedList<>();
        try(Scanner sc = new Scanner(new File(args[0]))){
//        try(Scanner sc = new Scanner(new File("sample.txt"))){  
            
            while(sc.hasNextLine()){
                String[] line = sc.nextLine().split(":");
                String[] turazok = line[1].split(";");
                tura t = new tura(line[0]);
                for (int i = 0; i < turazok.length; i++) {
                    if(list.isEmpty()){
                        nevek ujnev = new nevek();
                        ujnev.turak.add(t);
                        ujnev.nev=turazok[i];
                        list.add(ujnev);
                    }else{
                        boolean van = false;
                        int index = 0;
                        for (int j = 0; j < list.size(); j++) {
                            if(list.get(j).nev.equals(turazok[i])){
                                van = true;
                                index = j;
                            }
                        }
                        if(van){
                            list.get(index).turak.add(t);
                            van = false;
                            index = 0;
                        }else{
                            nevek ujnev = new nevek();
                            ujnev.turak.add(t);
                            ujnev.nev=turazok[i];
                            list.add(ujnev);
                        }
                    }
                }
                db++;
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        for (nevek l : list) {
           if(l.turak.size()==db){
               mindegyik.add(l);
           } 
        }
//        int seged = 0;
//        for (nevek object : list) {
//            if(object.turak.size()>seged){
//                seged = object.turak.size();
//            }
//        }
//        for (nevek li : list) {
//            if(li.turak.size()== seged){
//                mindegyik.add(li);
//            }
//        }
        Collections.sort(mindegyik);
        for (nevek li : mindegyik) {
            System.out.println(li);
        }
        
    }
}