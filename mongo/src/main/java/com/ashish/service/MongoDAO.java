/**
 * 
 */
package com.ashish.service;

import com.mongodb.DBObject;

/**
 * @author ashish
 *
 */
public interface MongoDAO {

	public Boolean add(DBObject dbObject);
	public DBObject fetch(DBObject dbObject);
	public DBObject update(DBObject dbObject);
	public Boolean delete(DBObject dbObject);
	
}
