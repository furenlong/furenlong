import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class wh{
	public static void main(String[] args){
		int i;
		float prenum=1;
		float bnum=0;
		process a=new process();
		a.read1();
		a.read2();
		a.number();
		a.num=a.counts1();
		a.read3();
		a.sift1();
		prenum=1;
		bnum=0;
		for (i=0;i<a.num;i++){
			System.out.println(a.mumber[i].m[0][0]+" "+a.mumber[i].m[0][1]);
			prenum=prenum*a.mumber[i].m[0][0];
			bnum=bnum+a.mumber[i].m[0][1];
		}
		System.out.println(prenum-bnum/100);
		
		a.c=1;
		a.number();
		a.num=a.counts1();
		prenum=1;
		bnum=0;
		for (i=0;i<a.num;i++){
			System.out.println(a.mumber[i].m[0][0]+" "+a.mumber[i].m[0][1]);
			prenum=prenum*a.mumber[i].m[0][0];
			bnum=bnum+a.mumber[i].m[0][1];
		}
		System.out.println(prenum-bnum/100);
		
		a.c=2;
		a.number();
		a.num=a.counts1();
		prenum=1;
		bnum=0;
		for (i=0;i<a.num;i++){
			System.out.println(a.mumber[i].m[0][0]+" "+a.mumber[i].m[0][1]);
			prenum=prenum*a.mumber[i].m[0][0];
			bnum=bnum+a.mumber[i].m[0][1];
		}
		System.out.println(prenum-bnum/100);
		
		a.c=3;
		a.number();
		a.num=a.counts1();
		prenum=1;
		bnum=0;
		for (i=0;i<a.num;i++){
			System.out.println(a.mumber[i].m[0][0]+" "+a.mumber[i].m[0][1]);
			prenum=prenum*a.mumber[i].m[0][0];
			bnum=bnum+a.mumber[i].m[0][1];
		}
		System.out.println(prenum-bnum/100);
		/*for(int i=0;i<14;i++){
			for(int j=0;j<500;j++){
					System.out.println(a.realmumber[i][j][0]+" "+a.realmumber[i][j][1]);
			}
		}*/
		
	}
}
class process{
	public process(){
		int i;
		s1=new String[10];
		s2=new String[10];
		c=0;
		numsign=new int[20];
		for (i=0;i<20;i++){
			numsign[i]=0;
		}
	}
	public void sift1(){
		int i,j;
		tr=1;
		tp=0;
		float temp=0;
		mumber = new pre[15];
		for (i=0;i<14;i++){
			mumber[i]=new pre(0);
		}
		for (i=0;i<14;i++){
			for (j=0;j<500;j++){
				if(realmumber[i][j][1]<=max&&realmumber[i][j][0]>=min){
					if (temp<(tr*realmumber[i][j][0]-tp-realmumber[i][j][1]/100.0)){
						temp=(float) (tr*realmumber[i][j][0]-tp-realmumber[i][j][1]/100.0);
						mumber[i].m[0][0]=realmumber[i][j][0];
						mumber[i].m[0][1]=realmumber[i][j][1];
					}
					numsign[i]=1;
					mumber[i].n=1;
				}
			}
			tr=tr*mumber[i].m[0][0];
			tp=(float) (tp+mumber[i].m[0][0]/100.0);
			temp=0;
		}
	}
	/*public void sift2(){
		int i,j,k;
		for (i=0;i<num;i++){
			if(sign[i]==0){
				for (j=0;j<499;j++){
					if(realmumber[i][j][0]>=max||realmumber[i][j][1]<=min){
						for (k=0;k<pre[i].n;k++){
							if(realmumber[i][j][0]>=pre[i].mumber[k][0]&&realmumber[i][j][1]<=pre[i].mumber[k][1]){
							
							}
							else if(){
							
							}
						}
					}
				}
			}
		}
	}*/
	public void read1(){
		int i=0;
        FileReader fr = null;
		try {
			fr = new FileReader("read1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		try {
			s1[i]=br.readLine();
			while(s1[i]!=null){
					i++;
				    s1[i]=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void read2(){
    	int i=0;
        FileReader fr2 = null;
		try {
			fr2 = new FileReader("read2.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br2=new BufferedReader(fr2);
		try {
			s2[i]=br2.readLine();
			while(s2[i]!=null){
					i++;
				   s2[i]=br2.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public void read3(){
		int i=0;
		int j=0;
		int cc=0;
		int q=0;
		realmumber=new float[16][500][2];
        FileReader fr3 = null;
		try {
			fr3 = new FileReader("read3.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br3=new BufferedReader(fr3);
		try {
			s3=br3.readLine();
			while(s3!=null){
				  // System.out.println(s3);
				   for(i=0;i<40;i++){
					   if(s3.charAt(i)==' '){
						   cc++;
					   }
					   if(cc==2||cc==4){
						   if(cc==2){
							   q=i+1;
							   cc++;
						   }
						   if(cc==4){
							   realmumber[j/500][j%500][0]=Float.parseFloat(s3.substring(q,i));
							   cc++;
						   }
						}
					   else if(cc==6||cc==8){
						   if(cc==6){
							   q=i+1;
							   cc++;
						   }
						   if(cc==8){
							   cc=0;
							   realmumber[j/500][j%500][1]=Float.parseFloat(s3.substring(q,i));
							   break;
						   }
					   }
				   }
				   s3=br3.readLine();
				   j++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int counts1 (){
		int i,count=0;
		int[] sign=new int[26];
		for(i=0;i<26;i++){
			sign[i]=0;
		}
		for (i=0;i<s1[c].length();i++){
			if('A'<=s1[c].charAt(i)&&s1[c].charAt(i)<='Z'){
				if(sign[s1[c].charAt(i)-'A']==0){
					count++;
					sign[s1[c].charAt(i)-'A']=1;
				}
			}
		}
		return count;
	}
	public void number(){
		min=Float.parseFloat(s2[c].substring(1,4));
		max=Float.parseFloat(s2[c].substring(5,7));
	}
	public float min;
	public float max;
	public int num;
	public int[] numsign;
	//private float premin;
	//private float premax;
	//private int prenum;
	public float tr;
	public float tp;
	public float[][][] realmumber;
	public int c;
	private String[] s1;
	private String[] s2;
	private String s3;
	public pre[] mumber;
}
class pre {
	public pre(int n){
		m=new float[50][2];
		this.n=n;
	}
	public int n;
	public float[][] m;
}