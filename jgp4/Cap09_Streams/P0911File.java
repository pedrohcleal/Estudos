/*
 * Java - Guia do Programador - 4a Ed.
 * Autor: Peter Jandl Junior
 * (c) 2020, Novatec Editora Ltda.
 *
 */
import java.io.File;

import java.util.Date;

public class P0911File {
	public static final void main (String args[]) {
		// usa diret�rio corrente se n�o foi dado um argumento
		File f = new File(args.length!=0 ? args[0] : ".");
		StringBuffer sb = new StringBuffer();

		if (f.isDirectory()) {
			// verifica se � diret�rio
			sb.append("Diretorio: "+ f.getAbsolutePath() + "\n");
			String arquivos[] = f.list(); // lista elementos do diret�rio
			for (int i=0; i<arquivos.length; i++){
				sb.append(arquivos[i] + "\n");
			}
		} else {
			// exibe informa��es do arquivo
			sb.append("Arquivo: "+ f.getAbsolutePath() + "\n");
			sb.append("Tamanho: "+ f.length() + "\n");
			sb.append("Oculto : "+ f.isHidden() + "\n");
			sb.append("Modif : "+ new Date(f.lastModified()) + "\n");
		}
		System.out.println(sb.toString());
	}
}
