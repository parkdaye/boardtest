var boardId = document.getElementById("boardId");
var updatepost = {
    init : function () {
        var _this = this;
        console.log(boardId.innerHTML);
        
        $('#btn-update').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'PUT',
            url: '/boards/posts/24',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('수정되었습니다.');
            location.href="./";
        }).fail(function (error) {
        	console.log(JSON.stringify(error));
            alert('error');
        });
    }
};

updatepost.init();