class Eval {

public static void main(String args[ ]) {

Integer m = Integer.parseInt(args[0]);

Integer n = m;

m--;

m++;

System.out.println(m == n);

}

}