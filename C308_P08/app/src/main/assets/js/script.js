var maxScore = 0;

$(document).on("pagecreate", function() {	
	
	var score = 0;	
	
	$("#play").click(function() {		
		score = 0;	
		$("#score").text("Your Score:" + score);	
		
		$("#snowflakef1").show();
		$("#snowflakef2").show();
		$("#snowflakef3").show();
		$("#snowflakef4").show();
		$("#snowflakef5").show();
		$("#snowflakef6").show();
		$("#snowflakef7").show();
	});
	
	$("#snowflakef1").click(function() {
		score = score + 2;
		$("#score").text("Your Score:" + score);				
		$("#snowflakef1").hide(1000);
		
		if(score > maxScore)
			{
				$("#mainScore").text("Your Highest Score:" + score);
				maxScore = score;
			}
			
	});
	$("#snowflakef2").click(function() {
		score = score + 3;
		$("#score").text("Your Score:" + score);		
		$("#snowflakef2").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	$("#snowflakef3").click(function() {
		score = score + 4;
		$("#score").text("Your Score:" + score);		
		$("#snowflakef3").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	$("#snowflakef4").click(function() {
		score = score + 1;
		$("#score").text("Your Score:" + score);		
		$("#snowflakef4").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	$("#snowflakef5").click(function() {
		score = score + 5;
		$("#score").text("Your Score:" + score);			
		$("#snowflakef5").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	$("#snowflakef6").click(function() {
		score = score + 3;
		$("#score").text("Your Score:" + score);			
		$("#snowflakef6").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	$("#snowflakef7").click(function() {
		score = score + 4;
		$("#score").text("Your Score:" + score);			
		$("#snowflakef7").hide(1000);
		
		if(score > maxScore)
		{
			$("#mainScore").text("Your Highest Score:" + score);
			maxScore = score;
		}
	});
	
	
});
