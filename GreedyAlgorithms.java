/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithms;

/**
 *
 * @author shivam
 */
public class GreedyAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={-1,0};
        int n=arr.length;
        System.out.println(findMinimumProduct(arr,n));
        
    }
    static int findMinimumProduct(int arr[],int n){
        int negMax=Integer.MIN_VALUE,negCount=0,zeroCount=0;
        int posMin=Integer.MAX_VALUE,product=1;
    
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            if(arr[i]<0){
                negCount++;
                negMax=Math.max(negMax, arr[i]);
            }
            
            if(arr[i]>0 &&arr[i]<posMin){
                posMin=arr[i];
            }
            
            product=product*arr[i];
        }
        System.out.println("zerocount:"+zeroCount);
        System.out.println("negmx:"+negMax);
        System.out.println("posmin:"+posMin);
        System.out.println("product:"+product);
        
        if(zeroCount==n||negCount==0&&zeroCount>0){
            return 0;
        }
        if(negCount==0){
            return posMin;
        }
        if(negCount%2==0 && negCount!=0){
            product=product/negMax;
            
        }
        return product;
    }
    
}
