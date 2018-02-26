package {{packageName}}.{{packageApi}};

{{healthCheckApiImports}}

{{healthCheckApiAnnotations}}
public class ApiHealthCheck {

	{{healthCheckApiAnnotationRequestMapping}}
	public ResponseEntity healthCheck(){
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
