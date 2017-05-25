/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBtest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class DBtest {

	
	public static void main(String[] args) {
		IDBManager[] database = {
			IDBManager.getDBObject(IDBManager.SYBASE_DATABASE),	
			IDBManager.getDBObject(IDBManager.ORACLE_DATABASE)	
		};
		System.out.println("<<변경 전>>");
		crud(database[0]);
		System.out.println("");
		System.out.println("<<변경 후>>");
		crud(database[1]);
	}
	
	
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
