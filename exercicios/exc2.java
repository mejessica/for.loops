


	public static void main(String[] args) {
		
			double ze = 1.1;
			double chico = 1.5;
			int ano = 0;
			
			for(ano = 1; ano > 0; ano++) {
				
				ze += 0.04;
				chico += 0.02;
				
				if(ze > chico)
				break;
				
			}
			
			
			System.out.println(ano+" anos necessários para que Zé seja maior que Chico");	
			
	}


