package edu.handong.csee.java.string;

class FamilyNamePrinter{
    private String[] stringNames;
    private String[] familyNames;

    public static void main(String[] args){
            FamilyNamePrinter name= new FamilyNamePrinter(args[0]);
            name.printFamliyNames();
        

    }
    public FamilyNamePrinter(String names){
        stringNames=names.split(", ");
        familyNames= new String[stringNames.length];
        for(int i=0;i<stringNames.length;i++){
            familyNames[i]=stringNames[i].trim().split(" ")[1];
        }
        
    }

    public void printFamliyNames(){
        for(String name:familyNames)
        System.out.println(name);
    }
}