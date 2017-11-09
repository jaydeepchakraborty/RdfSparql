package com.rdf;

public interface SPARQL_EXAMPLE {
	
	/*all the name of person*/
	String strQuery1 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
					  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
					 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
			         "SELECT ?x "+
					 "WHERE { ?Person foaf:name ?x . "
					 + " }";
	
	String strQuery2 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "
			 + " }"+
			 "ORDER BY DESC(?x)"+
			 "LIMIT 3";
	
	/*all the name of person whose name is jayeeta*/
	String strQuery3 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "FILTER(?x = \"jayeeta\"@fr)"
			 + " }";


	/*all the name of person who knows jayeeta*/
	String strQuery4 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "?Person foaf:knows ?person2 ."+
			 		  "?person2 foaf:name ?y ."+
			 		  "FILTER(?y = \"jayeeta\"@fr)"
			 + " }";
	
	String strQuery5 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "?Person foaf:knows ?person2 ."+
			 		  "?person2 foaf:name ?y ."+
			 		  "FILTER(?y != \"jayeeta\"@fr)"
			 + " }";
	
	/*begins with J*/
	String strQuery6 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "?Person foaf:knows ?person2 ."+
			 		  "?person2 foaf:name ?y ."+
			 		  "FILTER(regex(?y , \"^j\"))"
			 + " }";
	
	/*contains J*/
	String strQuery7 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "?Person foaf:knows ?person2 ."+
			 		  "?person2 foaf:name ?y ."+
			 		  "FILTER(regex(?x , \"Jay\"))"
			 + " }";
	
	/*contains M followed by R ignoring case*/
	String strQuery8 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
			 		  "?Person foaf:knows ?person2 ."+
			 		  "?person2 foaf:name ?y ."+
			 		  "FILTER(regex(?x , \"m.*r\",\"i\"))"
			 + " }";
	/*FILTER (?dt > "2000-01-01"^^xs:date)
	 * FILTER (?dept != ?mdept)
	 * FILTER (?sal >= ?low && ?sal <= ?high)*/
	
	
	/*Using COUNT(), MIN(), MAX(), SUM(), AVG() with GROUP BY can produce summary
	values for groups of triples. Note, these patterns might be specific to SPARQL 1.1*/
	String strQuery9 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT (COUNT(?name) as ?x) "+
			 "WHERE { ?Person foaf:name ?name . "
			 + " }";
	
	String strQuery10 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?x . "+
	         "FILTER langMatches( lang(?x), \"en\" )"+
			  " }";
	
	String strQuery11 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "DESCRIBE ?Person "+
			 "WHERE { ?Person foaf:name ?x . "+
	         "FILTER langMatches( lang(?x), \"en\" )"+
			  " }";
	
	String strQuery12 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "CONSTRUCT {?Person foaf:name ?x} "+
			 "WHERE { ?Person foaf:name ?x . "+
	         "FILTER langMatches( lang(?x), \"en\" )"+
			  " }";
	
	
	/*it does not work on inner persons tags*/
	String strQuery13 ="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			 "PREFIX foaf:<http://xmlns.com/foaf/0.1/>" +
	         "SELECT ?x "+
			 "WHERE { ?Person foaf:name ?name ."+
			 			"?Person foaf:mbox_sha1sum ?x ."+
			 "FILTER(?name = \"jayeeta\"@fr)"
			 + " }";
	
	
	
	
	
}
