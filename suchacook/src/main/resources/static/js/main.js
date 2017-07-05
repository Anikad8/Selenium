$( function() {
    $("#save").click( function( event ) {
        event.preventDefault();
        $('#dishList > tbody:last-child').append('<tr><td>'+$("#dish").val()+'</td></tr>');
    } );
} );