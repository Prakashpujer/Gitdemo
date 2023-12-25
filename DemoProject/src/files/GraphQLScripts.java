package files;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class GraphQLScripts {

	public static void main(String[] args) {

//Query:
	String responce =given().log().all().header("content-Type","application/json").body("{\"query\":\"query($episodeId:Int!, $locationId:Int!)\\n{\\n  \\n  episode(episodeId: $episodeId)\\n  {\\n    name\\n    air_date\\n    episode \\n  }\\n\\nlocation(locationId:$locationId){\\n  \\n  id\\n  name\\n  type\\n  dimension\\n}\\n\\n}\\n\\n\",\"variables\":{\"episodeId\":3643,\"locationId\":4975}}")
	.when().post("https://rahulshettyacademy.com/gq/graphql").then().extract().response().asString();

	System.out.println(responce);
	JsonPath js= new JsonPath(responce);
	String charactername=js.getString("data.episode.name");
	Assert.assertEquals(charactername, "Testepisode");
	
	// Mutations
	String Mutationresponce =given().log().all().header("content-Type","application/json").body("{\"query\":\"mutation($locationname:String!,$charactername:String!,$episodename:String!)\\n{\\n  createLocation(location:{name:$locationname,type:\\\"present\\\",dimension:\\\"456\\\"})\\n  {\\n    id\\n  }\\n  \\n createCharacter(character:{name:$charactername,type:\\\"newGen\\\",status:\\\"active\\\",species:\\\"mammals\\\",gender:\\\"male\\\",image:\\\"png\\\",originId:4975,locationId:4975 })\\n  {\\n    id\\n  }\\n  \\n  createEpisode(episode:{name:$episodename,air_date:\\\"June 20 2023\\\",episode:\\\"Geetha\\\"})\\n  {\\n    id\\n  }\\n  \\n}\",\"variables\":{\"locationname\":\"India\",\"charactername\":\"Baskin\",\"episodename\":\"Arjun\"}}")
			.when().post("https://rahulshettyacademy.com/gq/graphql").then().extract().response().asString();

			System.out.println(Mutationresponce);
			JsonPath js1= new JsonPath(Mutationresponce);
			charactername=js1.getString("data.locationname.name");
			
	}

}
