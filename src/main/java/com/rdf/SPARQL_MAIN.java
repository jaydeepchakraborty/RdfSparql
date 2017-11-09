package com.rdf;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;


public class SPARQL_MAIN {
	
	public static void main(String args[])
	{
		Model model = FileManager.get().loadModel(SPARQL_MAIN.class.getResource("/rdf/testFOAF.rdf").toString());
		
		Query query = QueryFactory.create(SPARQL_EXAMPLE.strQuery13);
		QueryExecution queryExe = QueryExecutionFactory.create(query,model);
		
		try{
			
			/*used for SELECT*/
			ResultSet resultset =  queryExe.execSelect();
			while(resultset.hasNext())
			{
				QuerySolution soln = resultset.nextSolution();
				Literal name = soln.getLiteral("x");
				System.out.println(name);
			}
			
					
			/*used for DESCRIBE*/
			/*Model describeModel = queryExe.execDescribe();
			System.out.println("Describe result = " + describeModel.toString());
			describeModel.close();*/
			
			/*used for CONSTRUCT*/
			/*Model constructModel = queryExe.execConstruct();
			System.out.println("Construct result = " + constructModel.toString());
			constructModel.close();*/
			
		}catch(Exception e)
		{
			
		}finally{
			queryExe.close();
			
		}
	}

}
