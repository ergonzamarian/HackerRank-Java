import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'ingredientes' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING pedido as parameter.
     */

    public static String ingredientes(String pedido) {
            
            
            ArrayList<String> listXburguer = new ArrayList<>();
            ArrayList<String> listXsalada = new ArrayList<>();
            ArrayList<String> listXbacon = new ArrayList<>();
            ArrayList<String> listXtudo = new ArrayList<>();
            ArrayList<String> listIngredientes = new ArrayList<>();
            ArrayList<String> listPedido = new ArrayList<>();
            
            String result="";
            
            String[] vetorPedidos = pedido.replaceAll("\\[", "").replaceAll("]", "").replaceAll(" ", "").split(",");
            //tratando pedidos
            for (int i = 0; i < vetorPedidos.length; i++) {
                listPedido.add(vetorPedidos[i]);
            }
            //x-burguer
            listXburguer.add("pao");
            listXburguer.add("queijo");
            listXburguer.add("hamburguer");
            listXburguer.add("maionese");
            
            //x-salada
            listXsalada.add("pao");
            listXsalada.add("queijo");
            listXsalada.add("hamburguer");
            listXsalada.add("tomate");
            listXsalada.add("cebola");
            listXsalada.add("maionese");
            
            //x-bacon
            listXbacon.add("pao");
            listXbacon.add("queijo");
            listXbacon.add("hamburguer");
            listXbacon.add("bacon");
            listXbacon.add("maionese");
            
            //x-tudo
            listXtudo.add("pao");
            listXtudo.add("queijo");
            listXtudo.add("hamburguer");
            listXtudo.add("bacon");          
            listXtudo.add("tomate");
            listXtudo.add("cebola");
            listXtudo.add("maionese");
            
            //Ingredientes Avulsos
            listIngredientes.add("bacon");
            listIngredientes.add("tomate");
            listIngredientes.add("cebola");
            listIngredientes.add("picles");
            
            Collections.sort(listXburguer);
            Collections.sort(listXsalada);
            Collections.sort(listXbacon);
            Collections.sort(listXtudo);
            
            switch (listPedido.get(0)) {
                
                case "x-burguer":
                    
                    if(listPedido.size()==1){
                        
                        for (int i = 0; i < listXburguer.size(); i++) {
                            if(i==0){
                                result = listXburguer.get(i);
                            }else{
                                result = result+","+listXburguer.get(i);
                            }
                        }
                    }else{
                        for (int i = 0; i < listPedido.size(); i++) {
                            char primeiroCaractere = listPedido.get(i).charAt(0);
                            
                            if(primeiroCaractere == '-'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listXburguer.contains(str)){
                                   Collections.sort(listXburguer);
                                   listXburguer.remove(str);
                               }else{
                                   return "invalido";
                               }
                            }
                            if(primeiroCaractere == '+'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listIngredientes.contains(str) && !listXburguer.contains(str)){
                                   listXburguer.add(str);
                                   Collections.sort(listXburguer);
                               }else{
                                   return "invalido";
                               }
                               
                            }
                        }
                        for (int i = 0; i < listXburguer.size(); i++) {
                            if(i==0){
                                result = listXburguer.get(i);
                            }else{
                                 result = result+","+listXburguer.get(i);
                            }
                        }
                    }                    

                break;

                case "x-salada":

                    if(listPedido.size()==1){
                        
                        for (int i = 0; i < listXsalada.size(); i++) {
                            if(i==0){
                                result = listXsalada.get(i);
                            }else{
                                result = result+","+listXsalada.get(i);
                            }
                        }
                    }else{
                        for (int i = 0; i < listPedido.size(); i++) {
                            char primeiroCaractere = listPedido.get(i).charAt(0);
                            
                            if(primeiroCaractere == '-'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listXsalada.contains(str)){
                                   Collections.sort(listXsalada);
                                   listXsalada.remove(str);
                               }else{
                                   return "invalido";
                               }
                            }
                            if(primeiroCaractere == '+'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listIngredientes.contains(str) && !listXsalada.contains(str)){
                                   listXsalada.add(str);
                                   Collections.sort(listXsalada);
                               }else{
                                   return "invalido";
                               }
                               
                            }
                        }
                        for (int i = 0; i < listXsalada.size(); i++) {
                            if(i==0){
                                result = listXsalada.get(i);
                            }else{
                                 result = result+","+listXsalada.get(i);
                            }
                        }
                    }        

                break;

                case "x-bacon":

                     if(listPedido.size()==1){
                        
                        for (int i = 0; i < listXbacon.size(); i++) {
                            if(i==0){
                                result = listXbacon.get(i);
                            }else{
                                result = result+","+listXbacon.get(i);
                            }
                        }
                    }else{
                        for (int i = 0; i < listPedido.size(); i++) {
                            char primeiroCaractere = listPedido.get(i).charAt(0);
                            
                            if(primeiroCaractere == '-'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listXbacon.contains(str)){
                                   Collections.sort(listXbacon);
                                   listXbacon.remove(str);
                               }else{
                                   return "invalido";
                               }
                            }
                            if(primeiroCaractere == '+'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listIngredientes.contains(str) && !listXbacon.contains(str)){
                                   listXbacon.add(str);
                                   Collections.sort(listXbacon);
                               }else{
                                   return "invalido";
                               }
                               
                            }
                        }
                        for (int i = 0; i < listXbacon.size(); i++) {
                            if(i==0){
                                result = listXbacon.get(i);
                            }else{
                                 result = result+","+listXbacon.get(i);
                            }
                        }
                    }                  
                    
                break;
                case "x-tudo":

                    if(listPedido.size()==1){
                        
                        for (int i = 0; i < listXtudo.size(); i++) {
                            if(i==0){
                                result = listXtudo.get(i);
                            }else{
                                result = result+","+listXtudo.get(i);
                            }
                        }
                    }else{
                        for (int i = 0; i < listPedido.size(); i++) {
                            char primeiroCaractere = listPedido.get(i).charAt(0);
                            
                            if(primeiroCaractere == '-'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listXtudo.contains(str)){
                                   Collections.sort(listXtudo);
                                   listXtudo.remove(str);
                               }else{
                                   return "invalido";
                               }
                            }
                            if(primeiroCaractere == '+'){
                               String str = listPedido.get(i).substring(1, listPedido.get(i).length());
                               if(listIngredientes.contains(str) && !listXtudo.contains(str)){
                                   listXtudo.add(str);
                                   Collections.sort(listXtudo);
                               }else{
                                   return "invalido";
                               }
                               
                            }
                        }
                        for (int i = 0; i < listXtudo.size(); i++) {
                            if(i==0){
                                result = listXtudo.get(i);
                            }else{
                                 result = result+","+listXtudo.get(i);
                            }
                        }
                    }            
                    
                break;
                default:
                    return "invalido";

            }
            return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String pedido = bufferedReader.readLine();

        String result = Result.ingredientes(pedido.toLowerCase());

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
