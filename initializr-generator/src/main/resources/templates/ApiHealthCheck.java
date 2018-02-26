package {{packageName}}.{{packageApi}};

{{healthCheckApiImports}}

{{healthCheckApiAnnotations}}
public class ApiHealthCheck {

	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public ResponseEntity healthCheck(){
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
