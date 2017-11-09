package com.rdf;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;

public class DifferentRDFFormat {

	public static void main(String[] args) {
		
		Model model = FileManager.get().loadModel("./rdf/testFOAF.rdf");
		//model.write(System.out,"TURTLE");//ttl
		//model.write(System.out, "RDF/XML");//rdf,owl
		//model.write(System.out, "N-TRIPLES");//nt
		//model.write(System.out, "JSON-LD");//jsonld
		/*JSON-LD is always recommended over rj*/
		//model.write(System.out, "RDF/JSON");//rj
		//model.write(System.out, "TriG");//trig -------not done
		//model.write(System.out, "N-Quads");//nq -------not done
		
		
	}

}
