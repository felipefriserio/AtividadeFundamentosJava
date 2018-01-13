package br.com.fiap.scj.fundamentos.atividade.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.scj.fundamentos.atividade.contrato.AcaoAposPagamento;

public class CriaArquivo implements AcaoAposPagamento{

	public void executa(StringBuilder sb) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			File file = new File("arquivos/pagamentos.txt");

			if (!file.exists()) 
				file.createNewFile();

			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)	bw.close();
				if (fw != null)	fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

}
