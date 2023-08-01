import java.util.Iterator;

import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;

public class JavaMongoDemo {
	//HIS-301 changes
	public Map<String, Object> map = new HashMap<String, Object>();

	public static void main(String[] args) throws Exception {

		try {

			// Connecting DataBase
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			// Creating DataBase
			MongoDatabase db = mongoClient.getDatabase("youtube");

			// Creating Collection
			MongoCollection<Document> collection = db.getCollection("channels");
			/*
			 * // Creating Document Document doc1 = new Document("name", "CarryMinati");
			 * doc1.append("id", 101); doc1.append("Subscribers", 24000000);
			 * doc1.append("Genre", "Roasting"); collection.insertOne(doc1);
			 * System.out.println("doc1 insertion is completed");
			 * 
			 * Document doc2 = new Document("name", "BB Ki Vines"); doc2.append("id", 102);
			 * doc2.append("Subscribers", 25500000); doc2.append("Genre", "Comedy");
			 * collection.insertOne(doc2);
			 * System.out.println("doc2 insertion is completed");
			 * 
			 * Document doc3 = new Document("name", "Round2Hell"); doc3.append("id", 103);
			 * doc3.append("Subscribers", 23500000); doc3.append("Genre", "Comedy");
			 * collection.insertOne(doc3);
			 * System.out.println("doc3 insertion is completed");
			 */
			// Retrieving the documents
			FindIterable<Document> iterDoc = collection.find();
			Iterator it = iterDoc.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			} // while closing
			/*
			 * // Updating multiple documents Bson filter = new Document("Genre", "Comedy");
			 * Bson newValue = new Document("Genre", "Humor"); Bson updateOperationDocument
			 * = new Document("$set", newValue); collection.updateMany(filter,
			 * updateOperationDocument);
			 * System.out.println("Document update successfully...");
			 * System.out.println("List of the documents after update"); iterDoc =
			 * collection.find(); it = iterDoc.iterator(); while (it.hasNext()) {
			 * System.out.println(it.next()); }
			 * 
			 * 
			 * //Counting number of documents in a collection
			 * System.out.println(collection.count());
			 * 
			 * Bson query = eq("Genre", "Roasting"); try { DeleteResult result =
			 * collection.deleteOne(query); System.out.println("Deleted document count: " +
			 * result.getDeletedCount()); } catch (MongoException me) {
			 * System.err.println("Unable to delete due to an error: " + me); }
			 */
			System.out.println("GitTest");
		} catch (Exception e) {
			System.out.println(e);
		}
	} //main closing

	//HIS-301 changes
	public void authenticate {
		//logic
	}

	//feature-vtx changes
	public void doProcess {
		//logic goes here
	}

} //class closing